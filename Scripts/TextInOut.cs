using Godot;
using System;
using System.Threading.Tasks;

public partial class TextInOut : Control
{

	//[Export] above a variable puts it as a property you can edit in the engine
	[Export]
	private TextEdit inputTextBox;
	[Export]
	private RichTextLabel outputTextBox;



    private bool busy = false;

    //Assigned to take the "pressed" signal from the button
    private void HandleButtonPress(){

        if (busy){
            return;
        }

        ConvertText();


    }


	private async Task ConvertText(){

        busy = true;

		string result = await GetOutputText(inputTextBox.Text);

		outputTextBox.Text = result;

        busy = false;

	}

	
	//Converts input box text to output box text
	private async Task<String> GetOutputText(string inText){

		//Waits 1 second to simulate AI processing
		await ToSignal(GetTree().CreateTimer(1f), "timeout");


		string result = inText + " -Hello!";
		return result;

	}

}

package edu.iu.habahram.remotecontroller.model;

//
// This is the invoker
//
public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
 
	public RemoteControl(int numberOfDevices) {
		onCommands = new Command[numberOfDevices];
		offCommands = new Command[numberOfDevices];
 
		for (int i = 0; i < numberOfDevices; i++) {
			onCommands[i] = () -> { return ""; };
			offCommands[i] = () -> { return ""; };
		}
	}
  
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	public String onButtonWasPushed(int slot) {

		return onCommands[slot].execute();
	}
 
	public String offButtonWasPushed(int slot) {

		return offCommands[slot].execute();
	}

	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
				+ "    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}

}

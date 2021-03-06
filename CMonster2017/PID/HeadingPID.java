package org.usfirst.frc2084.CMonster2017.PID;

//import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import org.usfirst.frc2084.CMonster2017.RobotMap;



// HeadingPID class uses the navX "yaw" value to control the robot heading
public class HeadingPID  extends PIDSubsystem {
	
	double Output; // Variable used to store the PID output
	
	// The constructor passes a name for the PIDSubsystem 
	public HeadingPID() {  
		super("HeadingPID", .05, 0.0, 0.0);  //calls the parent constructor with arguments P,I,D
		
		setAbsoluteTolerance(0.1);          // more parameters
		getPIDController().setContinuous(false);
		setInputRange(-180.0,  180.0);
	    setOutputRange(-1.0, 1.0);
	}
	
	public void Reset(){  //reset the PID controller
		HeadingPID.this.Reset();
		
	}
	protected void initDefaultCommand() {	
	}

	 protected double returnPIDInput() {
	    	return (double)RobotMap.ahrs.getYaw(); // returns the robot "Yaw" value that is providing the feedback 
	    	//for the system. (double) converts a float to double
	    }

	    protected void usePIDOutput(double output) {
	    	
	    	
	    	Output = (output); // this is the computed output value from the PIDController.
	    }
	    
	   public double getOutput(){  // called from the DriveBasePID 
			return Output;
	   }    	
	 

	    
	    




} 

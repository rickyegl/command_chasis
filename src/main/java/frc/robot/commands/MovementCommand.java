package frc.robot.commands;

import javax.xml.namespace.QName;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.MovementSubsystem;


public class MovementCommand extends CommandBase{
    private MovementSubsystem chassis;
    private int dir;
    public MovementCommand(MovementSubsystem chassis, int dir){
        this.chassis=chassis;
        this.dir=dir;
        addRequirements(chassis);
        System.out.println("Command");
        //chassis.arcadrive(dir);
        
    }
    @Override
    public void execute() {
        chassis.arcadrive(dir);
    }

    @Override
    public void end(boolean interrupted) {
        chassis.arcadrive(0);
    }
    

    

}

    


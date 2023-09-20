// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.MovementSubsystem;
import frc.robot.commands.MovementCommand;

public class RobotContainer {


  public RobotContainer() {
    configureBindings();
  }

  MovementSubsystem movement = MovementSubsystem.getInstance();

  private void configureBindings() {
    new CommandXboxController(0).povUp().whileTrue(new MovementCommand(movement,1));//.povUp().whileTrue(new InstantCommand(()->MovementSubsystem.movement(1)));
    new CommandXboxController(0).povLeft().whileTrue(new MovementCommand(movement,2));
    new CommandXboxController(0).povDown().whileTrue(new MovementCommand(movement,3));
    new CommandXboxController(0).povRight().whileTrue(new MovementCommand(movement,4));
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}

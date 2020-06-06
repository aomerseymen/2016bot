/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANDigitalInput.LimitSwitch;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants;

public class IntakeSubsystem extends SubsystemBase {
  /**
   * Creates a new IntakeSubsystem.
   */

  private final VictorSP rightIntakeMotor = new VictorSP(IntakeConstants.IntakeMotorPort);

  private final DigitalInput topLimitSwitch = new DigitalInput(IntakeConstants.topLimitSwitchPort);
  private final DigitalInput bottomLimitSwitch = new DigitalInput(IntakeConstants.bottomLimitSwitchPort);
 
  
  public IntakeSubsystem() {
  
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }
  public boolean getTopSwitch() {
    return topLimitSwitch.get();

  }

  public boolean getBottomSwitch() {
    return bottomLimitSwitch.get();
  

}

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.EncoderType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Constants.ShooterConstants;

public class ShooterSubsystem extends SubsystemBase {
  /**
   * Creates a new ShooterSubsystem.
   */
  private final CANSparkMax rightShooterMotor = new CANSparkMax(Constants.ShooterConstants.rightShooterMotorPin,MotorType.kBrushless);

  private final CANEncoder rightWheelEncoder = rightShooterMotor.getEncoder(EncoderType.kQuadrature, 4096);
  
  public ShooterSubsystem() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void runShooter(double speed){
    rightShooterMotor.set(speed);
    
  }
  public void stopShooter()
  {
    rightShooterMotor.set(0);
    
  }
}

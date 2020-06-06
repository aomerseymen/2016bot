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

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveSubsystem extends SubsystemBase {
  /**
   * Creates a new DriveSubsystem.
   */
  
  
  private final CANSparkMax rightMotor = new CANSparkMax(Constants.DriveConstants.rightMotorPin,MotorType.kBrushless);
  private final CANSparkMax leftMotor = new CANSparkMax(Constants.DriveConstants.leftMotorPin,MotorType.kBrushless);
  
  private final CANEncoder rightWheelEncoder = rightMotor.getEncoder(EncoderType.kQuadrature, 4096);
  private final CANEncoder leftWheelEncoder = leftMotor.getEncoder(EncoderType.kQuadrature, 4096);

  public DriveSubsystem() { 
  
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  
}



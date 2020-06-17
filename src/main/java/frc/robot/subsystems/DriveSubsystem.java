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

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.geometry.Pose2d;
import edu.wpi.first.wpilibj.geometry.Rotation2d;
import edu.wpi.first.wpilibj.kinematics.DifferentialDriveOdometry;
import edu.wpi.first.wpilibj.kinematics.DifferentialDriveWheelSpeeds;
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

  //----
  private final ADXRS450_Gyro gyro = new ADXRS450_Gyro();
  private final DifferentialDriveOdometry m_odometry;
  private final SpeedControllerGroup leftGroup = new SpeedControllerGroup(leftMotor);
  private final SpeedControllerGroup rightGroup = new SpeedControllerGroup(rightMotor);
  private final DifferentialDrive m_drive = new DifferentialDrive(leftGroup, rightGroup);

  public DriveSubsystem() { 
  
    rightWheelEncoder.setDistancePerPulse(7.62 * 2 * Math.PI / 2048.0);
    leftWheelEncoder.setDistancePerPulse(7.62 * 2 * Math.PI / 2048.0);
    gyro.calibrate();
    m_odometry = new DifferentialDriveOdometry(Rotation2d.fromDegrees(getHeading()));



  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    m_odometry.update(Rotation2d.fromDegrees(getHeading()), leftWheelEncoder.getDistance(),
                      rightWheelEncoder.getDistance());
  }

  public void arcadeDrive(double fwd, double rot) {
    m_drive.arcadeDrive(fwd, rot, true);
  }
  public double getRightWheelCm() {
    return rightWheelEncoder.getDistance();

  }

  public double getLeftWheelCm() {
    return leftWheelEncoder.getDistance();
  }
  

  public double getHeading() {
    return Math.IEEEremainder(gyro.getAngle(), 360);
  }

  public double getHeadingReversed()
  {
    return Math.IEEEremainder(-1*gyro.getAngle(), 360);
  }

  public DifferentialDriveWheelSpeeds getWheelSpeeds() {
    return new DifferentialDriveWheelSpeeds(leftWheelEncoder.getRate(), rightWheelEncoder.getRate());
  }
  public Pose2d getPose() {
    return m_odometry.getPoseMeters();
  }

public void arcadeDrive(int i, double power) {
}

  
}



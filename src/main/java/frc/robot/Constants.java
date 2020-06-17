/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.kinematics.DifferentialDriveKinematics;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {
  /**
   * Example of an inner class.  One can "import static [...].Constants.OIConstants.*" to gain
   * access to the constants contained within without having to preface the names with the class,
   * greatly reducing the amount of text required.
   */
  public static final class OIConstants {
    // Example: the port of the driver's controller
    public static final int kDriverControllerPort = 1;
  }
  public static final class DriveConstants{
    public static int rightMotorPin = 0;
    public static int leftMotorPin = 1;

    public static int rightWheelEncoder = 0;
    public static int leftWheelEncoder = 1;

    public static final double turnP = 1.0;
    public static final double turnI = 0.0;
    public static final double turnD = 0.0;

    public static final double driveP = 1.0;
    public static final double driveI = 1.0;
    public static final double driveD = 1.0;

    public static final double turnAccuracy = 2.0;

    public static final double ksVolts = 0.22;
    public static final double kvVoltSecondsPerMeter = 1.98;
    public static final double kaVoltSecondsSquaredPerMeter = 0.2;

    public static final double kPDriveVel = 8.5;
    public static final double kTrackwidthMeters = 0.69;
    public static final DifferentialDriveKinematics kDriveKinematics =
      new DifferentialDriveKinematics(kTrackwidthMeters);

    public static final double kMaxSpeedMetersPerSecond = 3;
    public static final double kMaxAccelerationMetersPerSecondSquared = 3;

        // Reasonable baseline values for a RAMSETE follower in units of meters and seconds
    public static final double kRamseteB = 2;
    public static final double kRamseteZeta = 0.7;
  }
  public static final class IntakeConstants{
    public static int IntakeMotorPort = 0;
    public static final int topLimitSwitchPort = 2;
    public static final int bottomLimitSwitchPort = 3;
    public static final int solenoidForwardPin = 0;
    public static final int solenoidBackwardPin = 1;
  }
  public static final class HopperConstants{
    public static int rightMotor = 4;
    public static int leftMotor = 5;
  }
  public static final class ShooterConstants{
    public static int rightShooterMotorPin = 6;
    
  }
  public final class JoystickConstants {
    public static final int driverControllerPort = 0;

}

}

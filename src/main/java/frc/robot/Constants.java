/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
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
  }
  public static final class IntakeConstants{
    public static int IntakeMotorPort = 0;
    public static final int topLimitSwitchPort = 2;
        public static final int bottomLimitSwitchPort = 3;
  }
  public static final class HopperConstants{
    public static int rightMotor = 4;
    public static int leftMotor = 5;
  }
  public static final class ShooterConstants{
    public static int rightShooterMotor = 6;
    public static int leftShooterMotor = 7;
  }

}

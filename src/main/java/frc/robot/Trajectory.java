/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import java.util.List;

import edu.wpi.first.wpilibj.controller.SimpleMotorFeedforward;
import edu.wpi.first.wpilibj.geometry.Pose2d;
import edu.wpi.first.wpilibj.geometry.Rotation2d;
import edu.wpi.first.wpilibj.trajectory.TrajectoryGenerator;
import edu.wpi.first.wpilibj.trajectory.constraint.DifferentialDriveVoltageConstraint;
import frc.robot.Constants.DriveConstants;
import frc.robot.subsystems.DriveSubsystem;


/**
 * Add your docs here.
 */
public class Trajectory {
    public Trajectory center_0;
    public Trajectory right_0;
    public Trajectory left_0;



    private DriveSubsytem m_drive;



public Trajectory(DriveSubsystem drive){
    m_drive = drive;

    var autoVoltageConstraint =
        new DifferentialDriveVoltageConstraint(
            new SimpleMotorFeedforward(DriveConstants.ksVolts,
                                       DriveConstants.kvVoltSecondsPerMeter,
                                       DriveConstants.kaVoltSecondsSquaredPerMeter),
            DriveConstants.kDriveKinematics,
            10);

    TrajectoryConfig configForward =
        new TrajectoryConfig(DriveConstants.kMaxSpeedMetersPerSecond,
             DriveConstants.kMaxAccelerationMetersPerSecondSquared)
            // Add kinematics to ensure max speed is actually obeyed
            .setKinematics(DriveConstants.kDriveKinematics)
            // Apply the voltage constraint
            .addConstraint(autoVoltageConstraint);

        center_0 = TrajectoryGenerator.generateTrajectory(
            List.of(
                new Pose2d(3.9, 4.5, new Rotation2d(0)),
                new Pose2d(8.7, 4.5, new Rotation2d(0))),
        configForward);  

        right_0 = TrajectoryGenerator.generateTrajectory(
            List.of(
                new Pose2d(3.5, 4.9, new Rotation2d(0)),                
                new Pose2d(8.7, 3.8, new Rotation2d(0))),
        configForward);

        left_0 = TrajectoryGenerator.generateTrajectory(
            List.of(
                new Pose2d(3.5, 3.3, new Rotation2d(0)),
                new Pose2d(8.7, 3.8, new Rotation2d(0))),
        configForward);      

            
}
}

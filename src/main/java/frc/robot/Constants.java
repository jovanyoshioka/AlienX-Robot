package frc.robot;

public class Constants {

  /**
   * Robot Map
   * A collection of ports and IDs for various objects representing hardware.
   */
  
  /**
   * CAN IDs
   */
  public static final int CHASSIS_LEFT_FRONT_ID         = 1;
  public static final int CHASSIS_LEFT_BACK_ID          = 2;
  public static final int CHASSIS_RIGHT_FRONT_ID        = 3;
  public static final int CHASSIS_RIGHT_BACK_ID         = 4;
  public static final int INTAKE_WHEEL_INTAKE_ID        = 5;
  public static final int CHAMBER_START_ID              = 6;
  public static final int CHAMBER_END_ID                = 7;
  public static final int LAUNCHER_WHEEL_TOP_ID         = 8;
  public static final int LAUNCHER_WHEEL_BOTTOM_ID      = 9;
  public static final int LAUNCHER_FEEDER_ID            = 10;
  public static final int LAUNCHER_PIVOT_ID             = 11;
  public static final int CLIMBER_STRING_PULLER_ID      = 12;
  public static final int CONTROLPANEL_WHEEL_SPINNER_ID = 13;

  /**
   * Pneumatic Ports
   */
  public static final int CHASSIS_GEARSHIFT_PORT_A = 0;
  public static final int CHASSIS_GEARSHIFT_PORT_B = 1;
  public static final int INTAKE_EXTENDER_PORT_A   = 2;
  public static final int INTAKE_EXTENDER_PORT_B   = 3;
  public static final int CLIMBER_PTO_PORT_A       = 4;
  public static final int CLIMBER_PTO_PORT_B       = 5;

  /**
   * Digital IO
   */

  public static final int CHAMBER_BALL_POS_1_PORT        = 0;
  public static final int CHAMBER_BALL_POS_2_PORT        = 1;
  public static final int CHAMBER_BALL_POS_3_PORT        = 2;
  public static final int CHAMBER_BALL_POS_4_PORT        = 3;
  public static final int LAUNCHER_BALL_SWITCH_PORT      = 4;
  public static final int CONTROLPANEL_COLOR_SENSOR_PORT = 5;

  /**
   * PWM
   */
  public static final int CLIMBER_RATCHET_LEFT  = 0;
  public static final int CLIMBER_RATCHET_RIGHT = 1;

}
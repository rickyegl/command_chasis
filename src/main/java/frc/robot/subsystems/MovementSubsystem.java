package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MovementSubsystem extends SubsystemBase{
  private final WPI_VictorSPX m_leftMotor = new WPI_VictorSPX(1);
  private final WPI_VictorSPX m_rightMotor = new WPI_VictorSPX(4);
  private final WPI_VictorSPX m_bleftDrive = new WPI_VictorSPX(3);
  private final WPI_VictorSPX m_brightDrive = new WPI_VictorSPX(2);
  //private final SendableChooser<String> m_chooser = new SendableChooser<>();
  private final XboxController controller = new XboxController(0);
  //private final DifferentialDrive m_robotDrive = new DifferentialDrive(m_leftMotor, m_rightMotor);
    
  /**
   * Returns an instance of {@link MovementSubsystem} for singleton purposes.
   * 
   * @return {@link MovementSubsystem} global instance
   */

    private static MovementSubsystem instance;

    private MovementSubsystem(){
      m_bleftDrive.follow(m_leftMotor);
      m_brightDrive.follow(m_rightMotor);
      //m_leftMotor.setInverted(true);
      System.out.println("init msubsystem");
    }
    public static MovementSubsystem getInstance() {
        if (instance == null) {
          instance = new MovementSubsystem();
        }
        return instance;
      }

    public void arcadrive(int dir){
      System.out.println(dir);
      if(dir==1){
        m_rightMotor.set(1);
        m_leftMotor.set(1);
      }
      if(dir==3){
        m_rightMotor.set(-1);
        m_leftMotor.set(-1);
      }
      if(dir==0){
        m_rightMotor.set(0);
        m_leftMotor.set(0);
      }
      
    }
    public static void StopMotors(){
      //m_robotDrive.arcadeDrive(-m_controller.getLeftY(), -m_controller.getLeftX());
    }
    
}

package agendador_de_tarefas;

import java.awt.AWTException;
import java.awt.Robot;
 
public class EuRobo implements Runnable {
    
        private boolean comando = true;
 
	public void run(){
            try{
		Robot robot = new Robot();
		robot.setAutoDelay(20000);
		while (comando) {
			robot.mouseMove(100, 100);
			robot.mouseMove(300, 300);
                        
		}
            }catch(AWTException e){
                e.printStackTrace();
            }
	}

    public void setComando(boolean comando) {
        this.comando = comando;
    }
        
        
 
}
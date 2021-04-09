import java.awt.AWTException;
import java.awt.Robot;

class Auto{
	/**
	 * 按下指定按键并释放后休眠指定时间,休眠时间不设置则默认为0.
	 * @param keycode 按键字符
	 * @param sleeptTime 休眠时间
	 * @throws AWTException
	 */
	public void keyOperation(char keycode,int sleeptTime)throws AWTException{
		Robot robot =  new Robot();
		robot.keyPress(keycode);
		robot.keyRelease(keycode);
		robot.delay(sleeptTime);
	}

	/**
	 * 按下指定按键并释放.
	 * @param keycode 按键字符
	 * @throws AWTException
	 */
	public void keyOperation(char keycode) throws AWTException {	
		keyOperation(keycode,0);
	}
	

}
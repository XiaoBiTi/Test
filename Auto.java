import java.awt.AWTException;
import java.awt.Robot;

class Auto{
	/**
	 * ����ָ���������ͷź�����ָ��ʱ��,����ʱ�䲻������Ĭ��Ϊ0.
	 * @param keycode �����ַ�
	 * @param sleeptTime ����ʱ��
	 * @throws AWTException
	 */
	public void keyOperation(char keycode,int sleeptTime)throws AWTException{
		Robot robot =  new Robot();
		robot.keyPress(keycode);
		robot.keyRelease(keycode);
		robot.delay(sleeptTime);
	}

	/**
	 * ����ָ���������ͷ�.
	 * @param keycode �����ַ�
	 * @throws AWTException
	 */
	public void keyOperation(char keycode) throws AWTException {	
		keyOperation(keycode,0);
	}
	

}
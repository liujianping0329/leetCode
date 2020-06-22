import java.io.*;
import java.net.*;      
	
public class GetDataFromFile {

	String getFileData(String fileName) {
		
		// �ǂݍ��񂾕������ێ�����X�g�����O�o�b�t�@��p�ӂ���
		StringBuffer sb = new StringBuffer();
		try {
			FileReader fr = new FileReader(fileName);	// 
			BufferedReader br = new BufferedReader(fr);	// 
			
			// �t�@�C������P�������ǂݍ��݁A�o�b�t�@�֒ǉ�����B
			int c;
			while ((c = br.read()) != -1) {
				sb.append((char) c);
			}
			br.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("�t�@�C���̃G���[�ł��B");
		}finally{
			// �o�b�t�@�̓��e�𕶎��񉻂��ĕԂ��܂��B
	  		return sb.toString();
		}
	}
}
	

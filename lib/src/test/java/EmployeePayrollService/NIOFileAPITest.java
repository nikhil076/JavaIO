package EmployeePayrollService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.IntStream;

public class NIOFileAPITest {

	private static String HOME = System.getProperty("c.Users.Nikhil Arvind.Batch307");
	private static String PLAY_WITH_NIO = "TempPlayGround";
	
	public void givenPathWhenCheckedThenConfirm() throws IOException
	{
		Path homePath = Path.of(HOME);
		Assert.assertTrue(Files.exists(homePath));
		
		Path playPath= Path.of(HOME +"/"+PLAY_WITH_NIO);
		if(Files.exists(playPath)) FileUtils.deleteFiles(playPath.toFile());
		Assert.assertTrue(Files.notExists(playPath));
		
		
		Files.createDirectories(playPath);
		Assert.assertTrue(Files.exists(playPath));
		
		IntStream.range(1,10).forEach(cntr ->{
			Path tempFile = Path.of(playPath+"/"+cntr);
			Assert.assertTrue(Files.notExists(tempFile));
			try {Files.createFile(tempFile);
				
			} catch (IOException e) {
				Assert.assertTrue(Files.exists(tempFile));
			}
		});
		
		Files.list(playPath).filter(Files::isRegularFile).forEach(System.out::println);
		Files.newDirectoryStream(playPath).forEach(System.out::println);
		Files.newDirectoryStream(playPath,path -> path.toFile().isFile() && path.toString().startsWith("temp")).forEach(System.out::println);
		
	}
}

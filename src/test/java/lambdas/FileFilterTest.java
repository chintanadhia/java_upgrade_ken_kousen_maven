package lambdas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileFilter;

public class FileFilterTest {
	private final File root = new File("src/main/java");

	@Test
	public void testListFiles() {
		File[] files = root.listFiles();
		assert files != null;
//		for (File file : files) {
//			System.out.println(file);
//		}
		Assertions.assertEquals(23, files.length);
	}

	@Test
	public void listDirectories_AnonymInnerClass() {
		File[] directories = root.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isDirectory();
			}
		});
		assert directories != null;
		Assertions.assertEquals(15, directories.length);

	}

	@Test
	public void listDirectories_ExpressionLambda() {
		File[] directories = root.listFiles((File pathname) -> pathname.isDirectory());
		assert directories != null;
		Assertions.assertEquals(15, directories.length);

	}
}

package com.advancedcollectionAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
/**
 * 
 * @author aambewad
 *here the in method SavingAccountReadWriteInfile() for writing data in file and in method readSavingAccountListFromFile()
 *reading data from file is present
 */
public class SavingAccountReadWriteInfile {

	public void writeArrayListSavingAccountInFile(
			List<SavingAccount> savingAccountList, String path)
			throws IOException {

		FileOutputStream fileOutputStream = new FileOutputStream(path);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				fileOutputStream);

		objectOutputStream.writeObject(savingAccountList);
		objectOutputStream.close();
		fileOutputStream.close();

	}

	public List<SavingAccount> readSavingAccountListFromFile(String path)
			throws Exception {

		List<SavingAccount> savingOne = null;
		if (new File(path).exists()) {

			FileInputStream fileInputstream = new FileInputStream(path);
			ObjectInputStream objectInputStream = new ObjectInputStream(
					fileInputstream);
			savingOne = (List<SavingAccount>) objectInputStream.readObject();
			objectInputStream.close();
			fileInputstream.close();

		} else if (!(new File(path).exists())) {
			throw new FileNotFoundException();
		} else
			throw new Exception();
		
		return savingOne;
	}

}

package com.zyz.com;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/15 22:31
 * @Description:
 */
class EncryptFacade {
    /**
     * 维持对其他对象的引用
     */
    private FileReader fileReader;
    private CipherMachine cipherMachine;
    private FileWriter fileWriter;

    public EncryptFacade(){
        fileReader = new FileReader();
        cipherMachine = new CipherMachine();
        fileWriter = new FileWriter();
    }

    /**
     *  调用其他对象的业务方法
     */
    public void FileEncrypt(){
        fileReader.Read();
        cipherMachine.Encrypt();
        fileWriter.Write();
    }


}


class NewEncryptFacade {
    /**
     * 维持对其他对象的引用
     */
    private FileReader fileReader;
    private NewCipherMachine newCipherMachine;
    private FileWriter fileWriter;

    public NewEncryptFacade(){
        fileReader = new FileReader();
        newCipherMachine = new NewCipherMachine();
        fileWriter = new FileWriter();
    }

    /**
     *  调用其他对象的业务方法
     */
    public void FileEncrypt(){
        fileReader.Read();
        newCipherMachine.NewEncrypt();
        fileWriter.Write();
    }


}




//文件读取类，充当子系统类

class FileReader{
    public void Read(){
        System.out.println("文件读取类子系统：读取文件...");
    }
}

//数据加密类，充当子系统类

class CipherMachine{
    public void Encrypt(){
        System.out.println("数据加密类子系统：加密文件...");
    }
}


//新的数据加密类，充当子系统类

class NewCipherMachine{
    public void NewEncrypt(){
        System.out.println("新的数据加密类子系统：加密文件...");
    }
}


//文件保存类，充当子系统类

class FileWriter{
    public void Write(){
        System.out.println("文件保存类子系统：保存文件...");
    }
}

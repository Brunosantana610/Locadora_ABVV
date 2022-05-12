package com.locadora_abvv.dados;

import java.io.*;

public class RepoFiles {

    public static Object lerDoArquivo (String nome){
        Object instanciaLocal = null;

        File in = new File(nome);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(in);
            ois = new ObjectInputStream(fis);
            instanciaLocal = ois.readObject();
        } catch (Exception e) {
            System.out.println("Não há arquivo de nome " + nome + " para ser processado. Um novo será criado");
        }
        finally {
            if (ois != null){
                try {
                    ois.close();
                }catch (IOException e){
                }
            }
        }
        return instanciaLocal;
    }

    public static void salvarArquivo(Object instance, String nome) {
        if (instance == null) {
            return;
        }
        File out = new File(nome);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(out);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(instance);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

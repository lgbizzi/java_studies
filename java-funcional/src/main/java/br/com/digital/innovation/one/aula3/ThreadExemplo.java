package br.com.digital.innovation.one.aula3;

/**
 *
 * @author Luís Guilherme Ferreira Bizzi - https://github.com/lgbizzi
 */
public class ThreadExemplo {
    public static void main(String[] args) {
        GeradorPDF iniciarGeradorPdf = new GeradorPDF();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGeradorPdf);
        /*Thread thread2 = new Thread (new BarraDeCarregamento3());
        
        
        barraDeCarregamento3.run();
        barraDeCarregamento2.run();
        
        thread.start();
        thread2.start();
        
        System.out.println("Nome da Thread: " + thread.getName());
        System.out.println("Nome da Thread: " + thread2.getName());
        */
        
        iniciarGeradorPdf.start();
        iniciarBarraDeCarregamento.start();
                
    }

}

class GeradorPDF extends Thread{
    @Override
    public void run(){
        try {
            System.out.println("Iniciar geração de PDF");
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("PDF gerado");
    }
}

class BarraDeCarregamento extends Thread{
    private Thread iniciarGeradorPdf;
    
    public BarraDeCarregamento(GeradorPDF iniciarGeradorPdf){
        this.iniciarGeradorPdf = iniciarGeradorPdf;
    }
    
    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(500);

                if(iniciarGeradorPdf.isAlive()){
                    break;
                }   

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class BarraDeCarregamento2 extends Thread{
    @Override
    public void run(){
        super.run();
        System.out.println("Rodei BarraDeCarregamento2: " + this.getName());
        
        try {
            Thread.sleep(3000);
            System.out.println("Rodei BarraDeCarregamento2: " + this.getName());
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

class BarraDeCarregamento3 implements Runnable{
    @Override
    public void run(){
        try {
            Thread.sleep(3000);
            System.out.println("Rodei BarraDeCarregamento3: " );
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}


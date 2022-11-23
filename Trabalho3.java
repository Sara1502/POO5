public class FIFO {
    
    public static String substituicaoFIFO(ArrayList<Frame> lista) {
        
        String frameSubstituido = "";
        int menorTempoCarga = 0;
        boolean primeiraVez = true;
        
        for (Frame f : lista) {
            if (primeiraVez) {
                menorTempoCarga = f.getTempoCarga();
                frameSubstituido = Integer.toString(f.getId());
                primeiraVez = false;
            }
            if (f.getTempoCarga() < menorTempoCarga) {
                menorTempoCarga = f.getTempoCarga();
                frameSubstituido = Integer.toString(f.getId());
            }
        }
        
        return frameSubstituido;
    }
    
    public static void main(String[] args) {
        
        ArrayList<Frame> lista = new ArrayList<Frame>();
        
        Frame frame1 = new Frame(1, 12, 10, 20, 1, 1);
        Frame frame2 = new Frame(2, 10, 1, 12, 0, 0);
        Frame frame3 = new Frame(3, 11, 2, 21, 1, 0);
        
        lista.add(frame1);
        lista.add(frame2);
        lista.add(frame3);
        
        String frameSubstituido = substituicaoFIFO(lista);
        
        System.out.println("O frame a ser substituído é o: " + frameSubstituido);
    }
    
}

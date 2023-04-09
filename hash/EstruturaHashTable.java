package hash;
public class EstruturaHashTable implements EstruturaDeDados{

    private Integer tabela[];

    public EstruturaHashTable() {
        tabela = new Integer[1000];
    }

    @Override
    public boolean insert(int chave) {
       int i = (chave % 1000);
       if(tabela[i] == null){
        tabela[i] = chave;
        return true;
       }
        return false;        
    }

    @Override
    public boolean delete(int chave) {
        int i = (chave % 1000);
        if(tabela[i] != null && tabela[i] == chave){
           tabela[i] = null;
           return true;
        }
        return false;
        
    }

    @Override
    public boolean search(int chave) {
        int i = (chave % 1000);
        if(tabela[i] != null && tabela[i] == chave){
            return true;
        }
        return false;
    }
    
}

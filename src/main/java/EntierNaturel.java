public class EntierNaturel {
    private int valeur;

    public EntierNaturel(int valeur) throws NombreNegatifException {
        if(valeur <= -1) throw new NombreNegatifException("Attention nombre negatif !!!", valeur);

        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) throws NombreNegatifException {
        if(valeur <= -1) throw new NombreNegatifException("Attention nombre negatif !!!", valeur);

        this.valeur = valeur;
    }
    public void decrement() throws NombreNegatifException {
        if(valeur <= 0) throw new NombreNegatifException("Attention nombre null !!!", 0);

        int valeur = getValeur();
        setValeur(--valeur);
    }
}


class Receipt{

    ArrayList<Item> listaOdArtikli;

    public Receipt(ArrayList<Item> listaOdArtikli) {
        this.listaOdArtikli = listaOdArtikli;
    }

    public void add_article(Item item){
        listaOdArtikli.add(item);
    }

    public  int vkupen_iznos(){
        int result = 0;
        for (int i=0; i < listaOdArtikli.size(); i++){
            result += listaOdArtikli.get(i).getPrice();
        }

        return result;

    }


}
import java.util.ArrayList;

public class MagazineLibrary {
    private ArrayList<Magazine> magazines;

    public MagazineLibrary(){
        this.magazines = new ArrayList<>();
    }

    public Magazine getMagazine(int index){
        Magazine mCopy = new Magazine(this.magazines.get(index));
        return mCopy;
    }

    public void setMagazine(int index, Magazine newMagazine){
        Magazine mCopy = new Magazine(newMagazine);
        this.magazines.set(index, mCopy);
    }

    public void addMagazine(Magazine newMagazine){
        Magazine mCopy = new Magazine(newMagazine);
        this.magazines.add(mCopy);
    }
}

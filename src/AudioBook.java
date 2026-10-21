public class AudioBook extends PhysicalTitle implements IAudioBook {
    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    protected double calculatePoints(){
        return (durationInMinutes * 0.5) * super.convertLiteratureType() * copies;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}

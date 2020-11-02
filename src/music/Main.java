package music;

public class Main {
    public static void main(String[] args)
    {
        Musician musician = new Musician("Andrei");
        musician.setInstrument(Instrument.GUITAR);
        Instrument[] instruments = {Instrument.VOICE, Instrument.GUITAR, Instrument.DRUMS, Instrument.BASS};
        Band band = new Band(3, "Succesful", instruments);
        band.addMusician(musician);
        band.printMusicians();
    }
}

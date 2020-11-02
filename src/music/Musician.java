package music;

public class Musician {
    private String name;
    private Instrument instrument;
    private Band band;

    public Musician(String name)
    {
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setInstrument(Instrument instrument)
    {
        this.instrument = instrument;
    }

    public Instrument getInstrument()
    {
        return instrument;
    }

    public void setBand(Band band) {
        this.band = band;
    }

    public Band getBand() {
        return band;
    }

    public boolean equals(Musician musician)
    {
        if(name.contentEquals(musician.name) && instrument.equals(musician.instrument) && band.equals(musician.band))
        {
            return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        return this.name+ " " + this.instrument.getName();
    }
}

package music;

public enum Instrument {
    GUITAR("Guitar"),
    DRUMS("Drums"),
    VOICE("Voice"),
    BASS("Bass");
    private String name;

    private Instrument(String name)
    {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

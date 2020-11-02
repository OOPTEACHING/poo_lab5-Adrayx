package music;

public class Band {
    private int numberOfMusicians;
    private String name;
    private Instrument[] instruments;
    private Musician[] musicians;
    private int index = 0;

    public Band(int numberOfMusicians, String name, Instrument[] instruments)
    {
        this.numberOfMusicians = numberOfMusicians;
        this.name = name;
        this.instruments = instruments;
        this.musicians = new Musician[numberOfMusicians];
    }

//    public Band()
//    {
//        this(0, "Unknown");
//    }

    public void printMusicians()
    {
        if(index == 0)
        {
            System.out.println("The band is in progress!");
        }
        else {
            System.out.println("The members of the band " + name + " are:");
            //for (int i = 0; i < index; i++)
            for(Musician musician: musicians)
            {
                if(musician != null) {
                    System.out.println(musician.toString());
                }
            }
        }
    }

    public void addMusician(Musician musician)
    {
        for(int i = 0; i < instruments.length; i++)
        {
            if(musician.getInstrument() == instruments[i])
            {
                musicians[index] = musician;
                index++;
                System.out.println("The musician has been added!");
            }
        }
    }

    public void deleteMusician(Musician musician)
    {
        for(int i = 0; i < index; i++)
        {
            if(musicians[i].equals(musician))
            {
                for(int j = i; j < index - 1; j++)
                    musicians[j] = musicians[j + 1];
                musicians[index - 1] = null;
                index--;
                System.out.println(musician.getName() + " left the band ;-;");
            }
        }
    }

    public boolean checkIfAvailable(Instrument instrument)
    {
        for(int i = 0; i < index; i++)
        {
            if(musicians[i].getInstrument().equals(instrument)) {
                System.out.println("Instrumentul " + instrument.getName() + " este deja in trupa!");
                return false;
            }
        }
        System.out.println("Niciun membru nu canta la acest instrument");
        return true;
    }

    public Instrument[] getMissingInstruments()
    {
        int[] instrumentUtilizat = new int[instruments.length];
        int numarInstrumenteUtilizate = 0;
        for(int i = 0; i < index; i++)
        {
            for(int j = 0; j < instruments.length; j++)
            {
                if(musicians[i].getInstrument().equals(instruments[j]))
                {
                    instrumentUtilizat[j] = 1;
                    numarInstrumenteUtilizate++;
                    j = instruments.length;
                }
            }
        }

        int indice = 0;
        Instrument[] instrumentsAvailable = new Instrument[instruments.length - numarInstrumenteUtilizate];
        for(int i = 0; i < instruments.length; i++)
        {
            if(instrumentUtilizat[i] == 0)
            {
                instrumentsAvailable[indice] = instruments[i];
                indice++;
            }
        }
        return instrumentsAvailable;
    }
}

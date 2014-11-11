/**
 *Fijar un momento determinado de tiempo expresado en horas y minutos, por ejemplo, las 23:45. El nombre del método debe ser setTime.
 *Hacer avanzar un minuto el tiempo fijado. Evidentemente este método se puede llamar tantas veces como se quiera. El nombre del método debe ser timeTick.
 *Devolver una cadena de 5 caracteres consistente en la hora y los minutos separados por dos puntos. El nombre del método debe ser getTime.
 */
public class ClockDisplay
{
    //The hour of the clock.
    private int hour;    
    //The minute of the clock.
    private int minute;  

    /**
     * Set the clock's initial values to 0 and 0.
     */
    public ClockDisplay()
    {
        hour = 0;
        minute = 0;
    }

    /**
     * Adds a minute to the current time.
     */
    public void timeTick()
    {
        if (minute < 59)
        {
            minute = minute + 1;
        }
        else if (hour < 23)
        {
            hour = hour + 1;
            minute = 0;
        }
        else
        {
            hour = 0;
            minute = 0;
        }

    }

    /**
     * Set the current time to the given values.
     */
    public void setTime(int givenHour, int givenMinute)
    {
        if ((givenHour < 24) && (givenHour >= 0) && (givenMinute < 60) && (givenMinute >= 0))
        {
            hour = givenHour;
            minute = givenMinute; 
        }
        else
        {
            System.out.println ("Please type again the hour and minute in a correct 24h format.");
        }

    }

    /**
     * Gives you the current time in the 24h format.
     */
    public void getTime()
    {
        if (minute < 10)
        {
            System.out.println("The current time is: " + hour + ":0" + minute);
        }
        else
        {
            System.out.println("The current time is: " + hour + ":" + minute);
        }
    }
} 

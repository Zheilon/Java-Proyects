package app.company.play;

public class Runner {

    private String name;
    private String lastName;

    public Runner (String name, String lastName)
    { this.name = name; this.lastName = lastName; }

    @Override
    public String toString ()
    {
        return String.format("Nombre: %s\nApellido: %s\n", name, lastName);
    }

    public String getName () { return name; }
    public String getLastName () { return lastName; }

}

public class Society {
    String name;
    String ruler;
    String title;
    String politicalIdeology;
    String religion;
    int population;

    void printValue(){
        System.out.printf("""
            
            The Kingdom of %s is ruled by %s %s.
            They follow %s as their political ideology.
            They practice %s as their religion.
            They have a population of %d

        """, name, title, ruler, politicalIdeology, religion, population);
    }
}

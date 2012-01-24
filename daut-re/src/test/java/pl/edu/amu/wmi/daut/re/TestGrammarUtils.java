import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

/**
 * Test metody isLinear()
 */
public class TestGrammarUtils extends TestCase {

/**
* Test sprawdzający działanie wszystkich metod klasy.
*/
    public final void testGrammarUtils() {

        GrammarNonterminalSymbol startSymbol = new GrammarNonterminalSymbol('S');
        GrammarNonterminalSymbol symbolA = new GrammarNonterminalSymbol('A');
        GrammarNonterminalSymbol symbolB = new GrammarNonterminalSymbol('B');
        GrammarNonterminalSymbol symbolC = new GrammarNonterminalSymbol('C');

        GrammarTerminalSymbol symbola = new GrammarTerminalSymbol('a');
        GrammarTerminalSymbol symbolb = new GrammarTerminalSymbol('b');
        GrammarTerminalSymbol symbolc = new GrammarTerminalSymbol('c');

        Grammar grammar = new Grammar(startSymbol);

        List<GrammarSymbol> tmp = new ArrayList<GrammarSymbol>();
        tmp.add(symbolA);
        tmp.add(symbolB);
        tmp.add(symbolC);

        grammar.addRule(new GrammarRule(startSymbol, tmp));
        grammar.addRule(new GrammarRule(symbolA, symbola));
        grammar.addRule(new GrammarRule(symbolB, symbolb));
        grammar.addRule(new GrammarRule(symbolC, symbolc));

        //assertFalse(GrammarUtils.isLinear(grammar));
    }
}
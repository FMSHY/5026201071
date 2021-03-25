	import javax.swing.JOptionPane;

public class JavaLibs5026201071 {

	public static void main(final String[] args) {
        final String[] opt = { "yes", "no" };
        final int opening = JOptionPane.showOptionDialog(null, "Hi i need help writing a poem, do you want to help me?", 
        		"H-Hey you got a sec?", 0, 1, null, opt, opt[0]);
        if (opening != 0) {
            JOptionPane.showMessageDialog(null, "Oh well see i see, you next time...", "goodbye", 0);
            System.exit(0);
            }
        String part1 = (String)JOptionPane.showInputDialog(null, "c-continue this sentence! When you are in love, everyday feels like ___", "o-okay lets start!", 3, null, null, "A Season");
        part1 = part1.toLowerCase();
        String part2 = (String)JOptionPane.showInputDialog(null, ",The sun is always ___", "a-alright lets go to the next one", 3, null, null, "Verb");
        part2 = part2.toLowerCase();
        String part3 = (String)JOptionPane.showInputDialog(null, ",the air feels ___", "next one!", 3, null, null, "Adjective");
        part3 = part3.toLowerCase();
        String part4 = (String)JOptionPane.showInputDialog(null, ",and the bird are always ___", "we're doing great, next one!", 3, null, null, "Verb");
        part4 = part4.toLowerCase();
        String part5 = (String)JOptionPane.showInputDialog(null, ".You see the world through rose-colored ___", "n-n-next one", 3, null, null, "Noun");
        part5 = part5.toLowerCase();
        String part6 = (String)JOptionPane.showInputDialog(null, ".When you see the person you love your heart ___", "woah very nice, next one", 3, null, null, "Verb");
        part6 = part6.toLowerCase();
        String part7 = (String)JOptionPane.showInputDialog(null, ".You can't ___", "great next one", 3, null, null, "Verb");
        part7 = part7.toLowerCase();
        String part8 = (String)JOptionPane.showInputDialog(null, "because they take your ___ away.", "o-okay just a little more", 3, null, null, "Noun");
        part8 = part8.toLowerCase();
        String part9 = (String)JOptionPane.showInputDialog(null, "The person you love is always on your ___", "a-almost finished", 3, null, null, "Noun");
        part9 = part9.toLowerCase();
        String part10 = (String)JOptionPane.showInputDialog(null, "and you can't imagine a ___ without them.", "l-l-last one!!", 3, null, null, "Time span");
        part10 = part10.toLowerCase();
        
        JOptionPane.showMessageDialog(null, "a-alright it's done l-let's see the result, arent you curious?", "g-good job", 1);
        final String story = "When you are in love, everyday feels like " + part1 + "  The sun is always " + part2 + " the air feels " + part3 +  " and the birds are always \n" + part4 + " you see the world through rose-colored " + part5 + " When you see the person you love, your heart\n" + part6 +  "  You cant " + part7 + " because they take your " + part8 +  "  away.  " + part9 + " and you cant imagine a " + part10 + " without them. ";        
        		JOptionPane.showMessageDialog(null, story, "TA DA! This is the poem you write..", 1);
        
       

        		JOptionPane.showMessageDialog(null, "Thanks for playing", "Thankyou", 1);
        		
	  } 
}
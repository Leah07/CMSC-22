/**
 * Created by Rumaguera on 10/26/2016.
 */
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class RockPaperScissorsLizardSpock extends Frame {
    private Label lbl;
    private Label player;
    private Label computer;
    private Label dialoglbl;
    private TextArea resultlbl;
    private Dialog gameDialog;
    private Button beginGame;
    private Button restartGame;
    private Button endGame;
    private TextField playerTxt;
    private TextField computerTxt;
    private CheckboxGroup choices = new CheckboxGroup();
    private Checkbox rock = new Checkbox("Rock", choices, false);
    private Checkbox paper = new Checkbox("Paper", choices, false);
    private Checkbox scissors = new Checkbox("Scissors", choices, false);
    private Checkbox lizard = new Checkbox("Lizard", choices, false);
    private Checkbox spock = new Checkbox("Spock", choices, false);


    private int playerScore = 0;
    private int computerScore = 0;

    public RockPaperScissorsLizardSpock(){
        setLayout(new FlowLayout());

        lbl = new Label("Your Choice: ");
        dialoglbl = new Label("");
        resultlbl = new TextArea("Result: \n", 5, 50);
        resultlbl.setEditable(false);
        player = new Label("Player's score: ");
        computer = new Label("Computer's score: ");
        playerTxt = new TextField();
        playerTxt.setEditable(false);
        computerTxt = new TextField();
        computerTxt.setEditable(false);
        beginGame = new Button("RockPaperScissorsLizardSpock");

        gameDialog = new Dialog(this, "Game Over!", Dialog.ModalityType.DOCUMENT_MODAL);
        gameDialog.setLayout(new FlowLayout());
        gameDialog.setSize(240,150);
        restartGame = new Button("Want to play again?");
        endGame = new Button("No thanks!");
        restartGame.setSize(50,75);
        gameDialog.add(dialoglbl);
        gameDialog.add(restartGame);
        gameDialog.add(endGame);

        restartGame.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                resultlbl.setText("");
                playerTxt.setText("");
                computerTxt.setText("");
                choices.setSelectedCheckbox(rock);

                playerScore = 0;
                computerScore = 0;
                gameDialog.dispose();
            }
        });

        beginGame.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play();
                if(playerScore == 5 || computerScore == 5){
                    gameOver();
                }
            }
        }));



        gameDialog.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing (WindowEvent we){
                System.exit(0);
            }
        });

        endGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(lbl);
        add(rock);
        add(paper);
        add(scissors);
        add(lizard);
        add(spock);
        add(beginGame);
        add(resultlbl);
        add(player);
        add(playerTxt);
        add(computer);
        add(computerTxt);
        setTitle("RockPaperScissorsLizardSpock");
        setSize(420,300);
        setVisible(true);

    }

        public void gameOver(){
            if(playerScore == 5 && (computerScore < playerScore)){
                dialoglbl.setText("Congratulations!! You won!!");
            } else {
                dialoglbl.setText("Computer won :(");
            }
            gameDialog.setVisible(true);
        }

        public void play(){
            int result2;

            String[] cp = new String[]{"Rock", "Paper", "Scissors", "Lizard", "Spock"};
            Random rand = new Random();
            String intCP = cp[rand.nextInt(cp.length)];

            if(intCP == "Rocks"){
                result2 = 1;
            } else if (intCP == "Paper") {
                result2 = 2;
            } else if (intCP == "Scissors") {
                result2 = 3;
            } else if (intCP == "Lizard") {
                result2 = 4;
            } else {
                result2 = 5;
            }

            int result1 = 2;

            if(choices.getSelectedCheckbox() == rock){
                if(result2 == 3 || result2 == 4){
                    result1 = 1;
                } else if(result2 == 1){
                    result1 = 0;
                } else {
                    result1 = -1;
                }

            }else if(choices.getSelectedCheckbox() == paper){
                if(result2 == 1 || result2 == 5){
                    result1 = 1;
                } else if(result2 == 2){
                    result1 = 0;
                } else {
                    result1 = -1;
                }

            }else if(choices.getSelectedCheckbox() == scissors){
                if(result2 == 2 || result2 == 4){
                    result1 = 1;
                } else if(result2 == 3){
                    result1 = 0;
                } else {
                    result1 = -1;
                }

            }else if(choices.getSelectedCheckbox() == lizard){
                if(result2 == 2 || result2 == 5){
                    result1 = 1;
                } else if(result2 == 4){
                    result1 = 0;
                } else {
                    result1 = -1;
                }

            }else if(choices.getSelectedCheckbox() == spock){
                if(result2 == 1 || result2 == 4){
                    result1 = 1;
                } else if(result2 == 5){
                    result1 = 0;
                } else {
                    result1 = -1;
                }
            }

            if(result1 == 1){
                playerScore++;
                resultlbl.setText("Result: \n");
                resultlbl.append("Player chooses " + choices.getSelectedCheckbox().getLabel() + "\n");
                resultlbl.append("Computer chooses " + cp[result2 - 1] + "\n");
                resultlbl.append("YOU WIN THIS ROUND!!!");
                playerTxt.setText(playerScore + "");
            }if(result1 == - 1){
                computerScore++;
                resultlbl.setText("Result: \n");
                resultlbl.append("Player chooses " + choices.getSelectedCheckbox().getLabel() + "\n");
                resultlbl.append("Computer chooses " + cp[result2 - 1] + "\n");
                resultlbl.append("COMPUTER WINS THIS ROUND!!!");
                computerTxt.setText(computerScore + "");
            }if(result1 == 0){
                resultlbl.setText("Result: \n");
                resultlbl.append("Player chooses " + choices.getSelectedCheckbox().getLabel() + "\n");
                resultlbl.append("Computer chooses " + cp[result2 - 1] + "\n");
                resultlbl.append("DRAW!!!");
            }
        }

        public static void main(String [] args) {

            RockPaperScissorsLizardSpock game = new RockPaperScissorsLizardSpock();
        }
}

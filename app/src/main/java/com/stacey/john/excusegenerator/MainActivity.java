package com.stacey.john.excusegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import java.util.Random;


// todo, create function that will prevent repeasts of the same parts

// make "tried to get me to date their ugly twin sister" change baised of gender of perp


public class MainActivity extends AppCompatActivity {

    int counter = 0;
    int creditCounter = 0;
    int hundredMark = 100;
    int numberLeft = 0;


    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton1();
        addListenerOnButton2();
    }

    public void addListenerOnButton1() {

        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new OnClickListener() {


            @Override
            public void onClick(View arg0) {

                numberLeft = hundredMark - counter;

                if (counter >= 501 && counter <= 940) {
                    counter = counter + 10;

                } else {
                    counter = counter + 1;

                }
                TextView testCounter = (TextView) findViewById(R.id.textView2);

                if (counter <= 17) {
                    testCounter.setText("Total excuses: " + counter);
                } else if (counter >= 18 && counter <= 29) {
                    testCounter.setText("Wow you must be a terrible person! to need " + counter + " excuses what are you Spiderman?");
                } else if (counter >= 30 && counter <= 49) {
                    testCounter.setText(+counter + "! really?!?!  just have no words, i am just glad i am not your boss or anyone who depends on you for anything at all!");
                } else if (counter >= 50 && counter <= 60) {
                    testCounter.setText("wow " + counter + " really?!?! thats a lot of button pushing i wonder what happens when you get to 100?");

                } else if (counter >= 60 && counter <= 100) {
                    testCounter.setText("wow i guess your going for it currently at :" + counter);

                } else if (counter >= 101 && counter <= 117) {
                    testCounter.setText("Nothing! Nothing happens at when it reached 100!, i bet you feel stupid now, i dont i feel super smart because i know what happens when you reach 1000 (spoiler alert!, its not nothing) : " + counter);
                } else if (counter >= 117 && counter <= 500) {
                    testCounter.setText("man this is taking forever! are we there yet? no? alrigthy keep taping : " + counter);
                } else if (counter >= 501 && counter <= 581) {
                    testCounter.setText("your rapid taping is starting to hurt my face so im going to help you out a bit : " + counter);
                } else if (counter >= 582 && counter <= 945) {
                    testCounter.setText("man we are really moving now!" + counter);
                } else if (counter == 946) {
                    testCounter.setText("i bet you missed this the first time: " + counter);
                } else if (counter >= 947 && counter <= 980) {
                    testCounter.setText("man we are really moving now!: " + counter);
                } else if (counter >= 981 && counter <= 999) {
                    testCounter.setText("SLOW DOWN!!!!!!!: " + counter);
                } else if (counter >= 1000 && counter <= 1010) {
                    testCounter.setText("HOORAY! YOU MADE IT TO  " + counter + "  i am so proud of you, this must be the very best thing that has happened in your whole entire life!, but because you made it this far i will tell you a secret," +
                            " dont tell anyone but there is a secret credits with the real name of the Creator, i would tell you it here but that is not my purpose. to acces the secret credits just press credits 10x and boom your there, " +
                            "its kinda sad all the work you did to find out you only had to push the other button 10 times, well there is nothing else to add so please stop touching me now");

                } else if (counter >= 1011 && counter <= 1020) {
                    testCounter.setText("Stop touching me, so i guess you dont get it that there is nothing more!, so im just going to stop talking: " + counter);
                } else if (counter >= 1021 && counter <= 1030) {
                    testCounter.setText("" + counter);
                } else if (counter >= 1021 && counter <= 1022) {
                    testCounter.setText("alright that does it im not even going to let you see the the Number anymore");
                } else {
                    testCounter.setText(" ");
                }
                //initilizes variable to start working with the random numbers
                Random rand = new Random();
                int r1, r2, r3, ri1, ri2, ri3;


                // arrays for the Strange insult excuse
                String[] insultCol1 = new String[]{"Ancient", "Rotten", "Stinky", "Lame", "Dimwitted", "Funky", "Crazy old", "Steamy", "Drizzly", "Grizzly", "Squirty", "Uptight", "Hairy", "Husky", "Arrogant", "Nippy", "Chunky", "smelly", "Drolling"};
                String[] insultCol2 = new String[]{"Hiney", "Poop", "Toot", "Wedgie", "Stool", "Fudge", "Bum", "Potty", "Dookie", "Pudding", "Sphincter", "Booger", "Feces", "Snot", "Crust", "Badonk-a", "Crud", "Sludge", "Tool"};
                String[] insultCol3 = new String[]{"Squeegee", "Turtle", "Cabbage", "Bomb", "Sniffer", "Binkie", "Stump", "Nugget", "Whistle", "Twig", "Knuckle", "Burger", "Hot Dog", "Loaf", "Freckle", "Soldier", "Kernal", "Shingle", "Warrior"};

                ri1 = rand.nextInt(insultCol1.length);
                ri2 = rand.nextInt(insultCol2.length);
                ri3 = rand.nextInt(insultCol3.length);


                //arrays to contain the varrious insults

                String[] col1 = new String[]{"i'm sorry but", "Please forgive me", "A thousand pardons please ", "I apolgize, however", "I'm never  like this", "You're never going to believe this", "guess what happened!?!?!",
                        "what happened was unbelievable! get this", "Boy do i have a story for you", "So i was minding my own business and BOOM!", "The most unbelievable thing just happened", "i had nothing to do with it because",
                        "Sorry I'm late", "It was horrifying!", "I couldn't help it", "This is a Terrible excuse but", "This is going to sound insane!", "By Odins beard!", "Please Forgive me", "My bad", "I swear it wasn't my fault",
                        "I lost track of time because", "I feel terrible, but", "Don't blame me"};

                //Perpertrator
                String[] col2 = new String[]{"your mom", "Godzilla", "Princess Peach", "the offensive line of the '76 Dallas Cowboys", "a handicapped gentleman", "a triceratops named Penelope", "stewie griffin",
                        "Rick and Morty", "the little Asian kid from Indiana Jones", "a man with 6 fingers on his right hand", "my great Grandson from the Future", "Raiden from Mortal Kombat", "Papa Smerf", "Scrooge McDuck", "the Ghost of Margret Thatcher",
                        "Zombie Hitler", "Johnny Bravo", "the entire Roman Empire", "Dave Chappelle's raciest aunt", "the Doctor", "Justin Beiber", "BATMAN", "the cast of Friends", "Hillary Clinton", "Bill Nye", "Spider-Man", "Steven Hawking",
                        "Homer Simpson", "the Statue of Liberty"};

                //delaying factor //insult is at col3[10]
                String[] col3 = new String[]{"game me a hickey", "tried to kill me", "ran me over with a diesel backhoe", "Died right in front of me", "ate my homework", "tried to seduce me", "beat me into submission",
                        "teamed up with a Giant chicken named Ernie and then crushed my car", "stole my bicycle", "slept with my uncle", "called me a \"" + insultCol1[ri1] + " " + insultCol2[ri2] + " " + insultCol3[ri3] + "\" what ever that means", "Stole my identity",
                        "broke into my house", "put me in a Chinese finger trap", "arrested me", "tried to get me to date their ugly twin Sister  ", "texted racial slurs from Donald trump's phone", "spin kicked me in the collar bone",
                        "tried to sell me vacuum cleaners", "used my car in a bank heist", "made me golf with macaroni and cheese in my shoes", "pulled me over in a stolen cop car and tried to have me join a boy band",
                        "gave me a single Lego and demanded that i build them an exact replica of the mars rover",
                        "tried to convince  me to become the spokesperson for verizon, naturally i refused because i have integrity and value my freedom just like the freedom in Verison's new prepaid plan that offers no annual contracts"};


                //sets random numbers = to 18 or the lengh of my arrays below
                r1 = rand.nextInt(col1.length);
                r2 = rand.nextInt(col2.length);
                r3 = rand.nextInt(col3.length);


                //sets the textview3 to the excuses
                TextView generatedText = (TextView) findViewById(R.id.textView3);
                if (counter >= 1000 && counter <= 1010) {

                    generatedText.setText(" ");


                } else {
                    generatedText.setText(col1[r1] + ", " + col2[r2] + ", " + col3[r3]);
                }


            }

        });

    }

    public void addListenerOnButton2() {

        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new OnClickListener() {


            @Override
            public void onClick(View arg0) {

                creditCounter++;
                TextView creditText = (TextView) findViewById(R.id.textView3);
                if (creditCounter >= 10) {
                    creditText.setText("Congratulations on finding the secret credits!, either you love to just hit the credits button a lot or you already knew this was here, lets be honest it was Me." +
                            "i made this just in case someone didn't believe me that i made this program, looking at you Vini, so just so we are clear this was made by John Royal Stacey");

                } else {


                    //sets the textview3 to the excuses

                    creditText.setText("Made By John");
                }


            }

        });

    }

}













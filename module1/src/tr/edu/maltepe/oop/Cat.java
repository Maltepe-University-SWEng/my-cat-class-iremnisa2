package tr.edu.maltepe.oop;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

    public class Cat {

        private String name;
        private int age;

        public Cat(String name, int age) {
            setName(name);
            setAge(age);
        }

        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }

        public void meow() {
            try {
                File soundFile = new File("C:\\Users\\irem nisa\\Downloads\\mixkit-cartoon-kitty-begging-meow-92.wav");
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
                Clip clip = AudioSystem.getClip();
                clip.open(audioStream);
                clip.start();


                Thread.sleep(clip.getMicrosecondLength() / 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }




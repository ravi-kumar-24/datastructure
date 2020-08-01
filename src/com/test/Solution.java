package com.test;
import java.util.*;

class Player{

    String playerName;
    int run;

    public Player(String playerName, int run) {
        this.playerName = playerName;
        this.run = run;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }
}

public class Solution {
  static   Map<String, Double > map = new HashMap<>();
  static   Map<String, Integer > mapIn = new HashMap<>();
    public static class PlayerStatisticsCollectorImpl implements PlayerStatisticsCollector {

        List<Player> list = new LinkedList<>();

        int count =0;
 //       @Override
//        public void putNewInnings(String player, int runs){
//            Player p  = new Player(player, runs);
//            list.add(p);
//            count++;
//            // YOUR CODE HERE
//            if(map.containsKey(player)){
//                map.put(player, (map.get(player))+runs);
//                mapIn.put(player, (mapIn.get(player))+1);
//
//            }else{
//                map.put(player, Double.valueOf(runs));
//                mapIn.put(player, 1);
//            }
//        }

        public void putNewInnings(String player, int runs){
            Player p  = new Player(player, runs);
            list.add(p);
        }
        @Override
        public double getAverageRuns(String player){
            // YOUR CODE HERE

            return list.stream().filter( p ->p.getPlayerName().equals(player)).mapToDouble( e ->e.getRun()).average().getAsDouble();
           // return map.get(player)/mapIn.get(player);
        }

        @Override
        public int getInningsCount(String player){
           return (int)list.stream().filter(p ->p.getPlayerName().equals(player)).count();
           // return mapIn.get(player);
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface PlayerStatisticsCollector {
        // This is an input. Make note of this player inning.  Runs is a non negative integer.
        void putNewInnings(String player, int runs);

        // Get the runs average(mathematical average) for a player
        double getAverageRuns(String player);

        // Get the total number of innings for the player
        int getInningsCount(String player);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final PlayerStatisticsCollector stats = new PlayerStatisticsCollectorImpl();
            final Set<String> players = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String player = tokens[0];
                players.add(player);
                final int runs = Integer.parseInt(tokens[1]);

                stats.putNewInnings(player, runs);

            }

            for (String player : players) {
                System.out.println(
                        String.format("%s %.4f %d", player, stats.getAverageRuns(player), stats.getInningsCount(player)));
            }

        }
        scanner.close();

    }
}

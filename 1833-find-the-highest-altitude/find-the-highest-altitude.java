class Solution {
    public int largestAltitude(int[] gain) {
        int[] netGain = new int[gain.length+1];

        for(int i=-1; i<gain.length; i++) {
            if(i == -1) {
                netGain[i+1] = 0;
            }
            else {
                netGain[i+1] = gain[i] + netGain[i];
            }
        }

        int highestAlt = 0;

        for(int j=0; j<netGain.length; j++) {
            if(highestAlt < netGain[j]) {
                highestAlt = netGain[j];
            }
        }

        return highestAlt;
    }
}
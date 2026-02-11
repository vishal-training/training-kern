class BatchJobProcessor {

    public static void main(String[] args) {

        int[] records = {101, -1, 102, 103, -99, 104};

        for (int i = 0; i < records.length; i++) {

            if (records[i] == -1) {
                System.out.println("Invalid record skipped");
                continue;
            }

            if (records[i] == -99) {
                System.out.println("Critical error encountered. Stopping job.");
                break;
            }

            System.out.println("Processing record: " + records[i]);
        }
    }
}

package id.ac.poliban.vb.e020320040.materialmelocalize;

class Sport {
    private final String title;
    private final String info;
    private final int imageResource;

    public Sport(String title, String info, int imageResource) {
        this.title = title;
        this.info = info;
        this.imageResource = imageResource;
    }
    String getTitle() {
        return title;
    }
    String getInfo() {
        return info;
    }

    public int getImageResource() {
        return imageResource;
    }
}

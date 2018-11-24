package android.practices.listviewexample.Model;

/**
 * Created by Amit on 04-Apr-18.
 */

/**
 * Model class which contains data of listview.
 */
public class ListViewDataModel {

    private String title;
    private String description;
    private int resid;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getResid() {
        return resid;
    }

    public void setResid(int resid) {
        this.resid = resid;
    }

    @Override
    public String toString() {
        return "ListViewDataModel{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", resid=" + resid +
                '}';
    }

}


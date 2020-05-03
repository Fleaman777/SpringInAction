package com.filippov.rm.common.dynamicchanges;

public class StandUpComic {

    private InterestingCase story;

    public StandUpComic(InterestingCase story) {
        this.story = story;
    }

    public void talkStrory(){
        System.out.println("Hello");
        System.out.println("my name's joker");
        System.out.println("today i'll speak about: ");
        story.rememberStory();
    }

    public InterestingCase getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }
}

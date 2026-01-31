package structuralPatterns.Bridge.Problem;

public interface PlayQuality {
    void play(String title);
}


//if we want to add a quality 4k then we can have smartTv4K, Web4k, Mobile4k or adding a device will have all qualities
//explosion of classes and player and quality are coupled
//in structural they should be coupled

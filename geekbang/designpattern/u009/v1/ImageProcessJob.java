package geekbang.designpattern.u009.v1;

import java.awt.Image;

/**
 * Created by HuGuodong on 11/22/19.
 */
public class ImageProcessJob {

  private static final String BUCKET_NAME = "ai_images_bucket";

  public void process() {
    Image image = null; // TODO
    AliyunImageStore imageStore = new AliyunImageStore();
    imageStore.createBucketInfNotExisting("ai_images_bucket");
    String accessToken = imageStore.generateAccessToken();
    imageStore.uploadToAliyun(image, BUCKET_NAME, accessToken);
  }
}

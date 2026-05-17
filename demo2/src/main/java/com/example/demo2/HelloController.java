package com.example.demo2;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;
    @FXML
    private ImageView d;
    Boolean dropk;
    int r;

    String[] d1={
            "file:src/GD.png",
            "file:src/GDE.png",
            "file:src/GDP1.png",
            "file:src/GDP2.png",
            "file:src/GDP3.png",
            "file:src/GDP4.png",
            "file:src/Lore.png"
    };
    String[] d2={
            "file:src/weapon_aug_gs_aug_aristocrat_light_large.4004dbb20c03d1a210ff9a98968ddb251bdfddc6.png",
            "file:src/weapon_awp_gs_awp_phobos_light_large.fca961cc99c704f09c44e6e82378434ef0e22087.png",
            "file:src/weapon_bizon_gs_pp_bizon_harvester_light_large.654d26d43d7e4583a0ede5e0ea6bb697858698dc.png",
            "file:src/weapon_fiveseven_cu_five_seven_daimyo_light_large.d394398cae1977546887145dcf6a4892d2ed29aa.png",
            "file:src/weapon_glock_cu_glock_wasteland_rebel_light_large.284899ab35e5a29c6edb64b2af194cee19a0ed89.png",
            "file:src/weapon_hkp2000_gs_p2000_imperial_dragon_light_large.cc82bc6353a0e8ce963f6b0b600905d4dc37bf4a.png",
            "file:src/weapon_m4a1_cu_m4a4_desolate_space_light_large.1fcbd5e124ae7c54cf12e6f76c431e6671a73845.png",
            "file:src/weapon_mac10_aq_mac_10_alien_camo_light_large.10568510ec37ec8515546e5ac03455391bb9ec2d.png",
            "file:src/weapon_nova_aq_nova_sci_fi_light_large.9cf268816cad5bdbe33bd4d1ddce1eb81f905164.png",
            "file:src/weapon_p90_gs_p90_full_throttle_light_large.70ef68d70617eb318e2df05e09f780448a1baf0d.png",
            "file:src/weapon_p250_gs_p250_metal_panels_light_large.a104ce12e50fa24711708782e5d7b23e1bcb7d1b.png",
            "file:src/weapon_revolver_cu_r8_cybersport_light_large.d5eb827f99a401915b8377eda7b81a0bc9cae4bf.png",
            "file:src/weapon_sawedoff_cu_sawed_off_lime_light_large.87fbbe1597ea04a51b56f3b0f7c3fc6a5ff6553c.png",
            "file:src/weapon_scar20_gs_scar20_bloodsport_light_large.dd99feccb31d2ec296bcd620abd885e6fe50d44e.png",
            "file:src/weapon_sg556_cu_sg553_aerial_light_large.a123874095a96a92aaacd0f64a4fef54fa455e82.png",
            "file:src/weapon_tec9_am_tec_9_sea_salt_light_large.726f78fd872aa2ccfcab9a051b4b79c314d50a4e.png"
    };

    @FXML
    protected void onButtonClick() {
        Random random = new Random();
        int drop = random.nextInt(23);
        welcomeText.setText(String.valueOf(drop));
        if (drop >= 0 && drop <= 17) {
            dropk=true;
        }
        else if(drop>17){dropk=false;}
        if(drop<=17){
            r = random.nextInt(d2.length);
            Image image = new Image(d2[r]);
            d.setImage(image);
        }
        else if(drop>17){
            r = random.nextInt(d1.length);
            Image image = new Image(d1[r]);
            d.setImage(image);

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(d);
        translate.setByX(-1000);
        translate.setDuration(Duration.seconds(20));
        translate.play();
    }
}



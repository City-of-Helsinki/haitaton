package fi.hel.haitaton.hanke.tormaystarkastelu

enum class LuokitteluType {
    HAITTA_AJAN_KESTO,
    TODENNAKOINEN_HAITTA_PAAAJORATOJEN_KAISTAJARJESTELYIHIN,
    KAISTAJARJESTELYN_PITUUS,
    KATULUOKKA,
    LIIKENNEMAARA,
    PYORAILYN_PAAREITTI,
    BUSSILIIKENNE,
    RAITIOVAUNULIIKENNE
}

enum class PyorailyTormaysLuokittelu(s: String) {
    PRIORISOITU_REITTI("Pyöräilyn priorisoidut reitit / priorisoidun reitin osana toimiva katu"),
    PAAREITTI("Pyöräilyn pääreitti / pääreitin osana toimiva katu"),
    EI_PYORAILUREITTI("Ei vaikuta pyöräliikenteeseen")
}

enum class RaitiovaunuTormaysLuokittelu(s: String) {
    JAETTU_KAISTA("Raitiovaunut samalla kaistalla autojen kanssa"),
    OMA_KAISTA("Raitiovaunuilla oma kaista"),
    EI_RAITIOVAUNULIIKENNETTA("Ei vaikuta raitiovaunuliikenteeseen")
}

enum class KatuluokkaTormaysLuokittelu(s: String) {
    PAAKATU_MOOTTORIVAYLA("Pääkatu tai moottoriväylä"),
    ALUEELLINEN_KOKOOJA("Alueellinen kokoojakatu"),
    PAIKALLINEN_KOKOOJA("Paikallinen kokoojakatu"),
    KANTAKAUPUNGIN_TONTTIKATU("Kantakaupungin tonttikatu"),
    MUU_TONTTIKATU_ALUE("Muu tonttikatu tai alue"),
    EI_MOOTTORILIIKENNE_VAIK("Ei vaikuta moottoriajoneuvoliikenteeseen")
}

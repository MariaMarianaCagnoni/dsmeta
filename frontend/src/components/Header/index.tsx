import logo from '../../assets/img/logo.svg'
import './styles.css'


function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="DSMeta" />
                <h1>DSMeta</h1>
                <p>
                    Desenvolvido por <br/>
                    <a href="https://www.instagram.com/devsuperior.ig">@devsuperior.ig , </a>
                    <a href="https://www.instagram.com/mari_cagnonidev">@mari_cagnonidev</a>
                </p>
            </div>
        </header>
    )
}

export default Header
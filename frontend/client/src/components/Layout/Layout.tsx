import React from 'react';
import './Layout.css';
import { Container } from '@mui/material';
import Footer from '../Footer/Footer';
import Header from '../Header/Header';

type Props = {
  children: React.ReactNode;
};

const Layout: React.FC<Props> = ({ children }: Props) => {
  return (
    <>
      <header>
        <Header />
      </header>
      <main>
        <Container maxWidth="lg" sx={{ height: '100%' }}>
          {children}
        </Container>
      </main>
      <footer>
        <Footer />
      </footer>
    </>
  );
};

export default Layout;
